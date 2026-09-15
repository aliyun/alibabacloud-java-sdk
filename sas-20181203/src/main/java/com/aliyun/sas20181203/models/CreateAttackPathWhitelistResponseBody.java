// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttackPathWhitelistResponseBody extends TeaModel {
    /**
     * <p>The attack path whitelist.</p>
     */
    @NameInMap("AttackPathWhitelist")
    public CreateAttackPathWhitelistResponseBodyAttackPathWhitelist attackPathWhitelist;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAttackPathWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackPathWhitelistResponseBody self = new CreateAttackPathWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAttackPathWhitelistResponseBody setAttackPathWhitelist(CreateAttackPathWhitelistResponseBodyAttackPathWhitelist attackPathWhitelist) {
        this.attackPathWhitelist = attackPathWhitelist;
        return this;
    }
    public CreateAttackPathWhitelistResponseBodyAttackPathWhitelist getAttackPathWhitelist() {
        return this.attackPathWhitelist;
    }

    public CreateAttackPathWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAttackPathWhitelistResponseBodyAttackPathWhitelist extends TeaModel {
        /**
         * <p>The ID of the attack path whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>apwl-b33dec0acf9b42aabde032d656c0****</p>
         */
        @NameInMap("AttackPathWhitelistId")
        public String attackPathWhitelistId;

        public static CreateAttackPathWhitelistResponseBodyAttackPathWhitelist build(java.util.Map<String, ?> map) throws Exception {
            CreateAttackPathWhitelistResponseBodyAttackPathWhitelist self = new CreateAttackPathWhitelistResponseBodyAttackPathWhitelist();
            return TeaModel.build(map, self);
        }

        public CreateAttackPathWhitelistResponseBodyAttackPathWhitelist setAttackPathWhitelistId(String attackPathWhitelistId) {
            this.attackPathWhitelistId = attackPathWhitelistId;
            return this;
        }
        public String getAttackPathWhitelistId() {
            return this.attackPathWhitelistId;
        }

    }

}
