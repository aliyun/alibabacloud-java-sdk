// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddClientUserDefineRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <br>
         * <p>*   **windows**: Windows</p>
         * <p>*   **linux**: Linux</p>
         * <p>*   **all**: all types</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The switch ID of the custom defense rule.</p>
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
