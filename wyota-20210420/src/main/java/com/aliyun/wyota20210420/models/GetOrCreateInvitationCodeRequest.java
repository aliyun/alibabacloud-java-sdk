// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetOrCreateInvitationCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExpireDays")
    public Integer expireDays;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ExpireMinutes")
    public Integer expireMinutes;

    /**
     * <strong>example:</strong>
     * <p>tg-XXX</p>
     */
    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    /**
     * <strong>example:</strong>
     * <p>cron</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static GetOrCreateInvitationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrCreateInvitationCodeRequest self = new GetOrCreateInvitationCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetOrCreateInvitationCodeRequest setExpireDays(Integer expireDays) {
        this.expireDays = expireDays;
        return this;
    }
    public Integer getExpireDays() {
        return this.expireDays;
    }

    public GetOrCreateInvitationCodeRequest setExpireMinutes(Integer expireMinutes) {
        this.expireMinutes = expireMinutes;
        return this;
    }
    public Integer getExpireMinutes() {
        return this.expireMinutes;
    }

    public GetOrCreateInvitationCodeRequest setTerminalGroupId(String terminalGroupId) {
        this.terminalGroupId = terminalGroupId;
        return this;
    }
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    public GetOrCreateInvitationCodeRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
