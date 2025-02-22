package com.hncboy.chatgpt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hncboy.chatgpt.domain.entity.ChatMessageDO;
import com.hncboy.chatgpt.domain.entity.ChatRoomDO;

/**
 * @author hncboy
 * @date 2023/3/25 16:30
 * 聊天室相关业务接口
 */
public interface ChatRoomService extends IService<ChatRoomDO> {

    /**
     * 创建聊天室
     *
     * @param chatMessageDO 聊天记录
     * @return 聊天室
     */
    ChatRoomDO createChatRoom(ChatMessageDO chatMessageDO);
}
