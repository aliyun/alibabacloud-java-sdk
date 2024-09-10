// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddClientUserDefineRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>379a9b8f-107b-4630-9e95-2299a1ea****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The identifier of the custom defense rule.</p>
     */
    @NameInMap("UserDefineRuleAddResult")
    public AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult userDefineRuleAddResult;

    public static AddClientUserDefineRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddClientUserDefineRuleResponseBody self = new AddClientUserDefineRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddClientUserDefineRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddClientUserDefineRuleResponseBody setUserDefineRuleAddResult(AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult userDefineRuleAddResult) {
        this.userDefineRuleAddResult = userDefineRuleAddResult;
        return this;
    }
    public AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult getUserDefineRuleAddResult() {
        return this.userDefineRuleAddResult;
    }

    public static class AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux</li>
         * <li><strong>all</strong>: all types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The switch ID of the custom defense rule.</p>
         * 
         * <strong>example:</strong>
         * <p>USER-DEFINE-RULE-SWITCH-TYPE_200****</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        public static AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult build(java.util.Map<String, ?> map) throws Exception {
            AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult self = new AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult();
            return TeaModel.build(map, self);
        }

        public AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public AddClientUserDefineRuleResponseBodyUserDefineRuleAddResult setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

}
