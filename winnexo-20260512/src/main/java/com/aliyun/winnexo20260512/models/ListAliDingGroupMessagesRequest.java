// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAliDingGroupMessagesRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The session ID, typically used for JSSDK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cid-example</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The traffic direction. Valid values:</p>
     * <ul>
     * <li>OutBound: outbound.</li>
     * <li>InBound: inbound.</li>
     * <li>Both: bidirectional.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>newer</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The tenant ID. This is a common parameter. Pass it explicitly through <code>--tenant-id</code> in winnexo-cli.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The relationship information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T09:00:00+08:00</p>
     */
    @NameInMap("time")
    public String time;

    public static ListAliDingGroupMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAliDingGroupMessagesRequest self = new ListAliDingGroupMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListAliDingGroupMessagesRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListAliDingGroupMessagesRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ListAliDingGroupMessagesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListAliDingGroupMessagesRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListAliDingGroupMessagesRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListAliDingGroupMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAliDingGroupMessagesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListAliDingGroupMessagesRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
