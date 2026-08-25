// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetOrCreateInvitationCodeRequest extends TeaModel {
    /**
     * <p>The validity period in days, calculated from the current time. Set to -1 for permanent validity.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExpireDays")
    public Integer expireDays;

    /**
     * <p>The validity period in minutes, calculated from the current time. Set to -1 for permanent validity.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ExpireMinutes")
    public Integer expireMinutes;

    /**
     * <p>The terminal group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-XXX</p>
     */
    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    /**
     * <p>The validity period type. Valid values:</p>
     * <ul>
     * <li>1: The response returns the expiration in days. This is the default value if Type is not specified.</li>
     * <li>2: The response returns the expiration in minutes.</li>
     * </ul>
     * 
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
