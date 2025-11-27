// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class ChatDetail extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("UserInfo")
    public ChatDetailUserInfo userInfo;

    public static ChatDetail build(java.util.Map<String, ?> map) throws Exception {
        ChatDetail self = new ChatDetail();
        return TeaModel.build(map, self);
    }

    public ChatDetail setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ChatDetail setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public ChatDetail setUserInfo(ChatDetailUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ChatDetailUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ChatDetailUserInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        public static ChatDetailUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ChatDetailUserInfo self = new ChatDetailUserInfo();
            return TeaModel.build(map, self);
        }

        public ChatDetailUserInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChatDetailUserInfo setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
