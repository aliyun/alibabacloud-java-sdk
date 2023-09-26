// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVulGlobalConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VulGlobalConfigList")
    public java.util.List<ListVulGlobalConfigResponseBodyVulGlobalConfigList> vulGlobalConfigList;

    public static ListVulGlobalConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVulGlobalConfigResponseBody self = new ListVulGlobalConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVulGlobalConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVulGlobalConfigResponseBody setVulGlobalConfigList(java.util.List<ListVulGlobalConfigResponseBodyVulGlobalConfigList> vulGlobalConfigList) {
        this.vulGlobalConfigList = vulGlobalConfigList;
        return this;
    }
    public java.util.List<ListVulGlobalConfigResponseBodyVulGlobalConfigList> getVulGlobalConfigList() {
        return this.vulGlobalConfigList;
    }

    public static class ListVulGlobalConfigResponseBodyVulGlobalConfigList extends TeaModel {
        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("ConfigValue")
        public String configValue;

        public static ListVulGlobalConfigResponseBodyVulGlobalConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListVulGlobalConfigResponseBodyVulGlobalConfigList self = new ListVulGlobalConfigResponseBodyVulGlobalConfigList();
            return TeaModel.build(map, self);
        }

        public ListVulGlobalConfigResponseBodyVulGlobalConfigList setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ListVulGlobalConfigResponseBodyVulGlobalConfigList setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

    }

}
