package com.hncboy.chatgpt.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.hncboy.chatgpt.enums.ApiTypeEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author hncboy
 * @date 2023/3/25 16:14
 * 聊天室
 */
@Data
@TableName("chat_room")
public class ChatRoomDO {

    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 对话 id
     * 唯一
     */
    private String conversationId;

    /**
     * 第一条消息 id
     * 唯一
     */
    private String firstMessageId;

    /**
     * 对话标题，从第一条消息截取
     */
    private String title;

    /**
     * API 类型
     * 不同类型的对话不能一起存储
     */
    private ApiTypeEnum apiType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
