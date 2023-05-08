// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddClientUserDefineRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public Long id;

        @NameInMap("Platform")
        public String platform;

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
