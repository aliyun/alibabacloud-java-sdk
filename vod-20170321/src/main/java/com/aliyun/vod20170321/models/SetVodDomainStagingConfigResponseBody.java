// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetVodDomainStagingConfigResponseBody extends TeaModel {
    @NameInMap("DomainConfigList")
    public java.util.List<SetVodDomainStagingConfigResponseBodyDomainConfigList> domainConfigList;

    @NameInMap("RequestId")
    public String requestId;

    public static SetVodDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVodDomainStagingConfigResponseBody self = new SetVodDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVodDomainStagingConfigResponseBody setDomainConfigList(java.util.List<SetVodDomainStagingConfigResponseBodyDomainConfigList> domainConfigList) {
        this.domainConfigList = domainConfigList;
        return this;
    }
    public java.util.List<SetVodDomainStagingConfigResponseBodyDomainConfigList> getDomainConfigList() {
        return this.domainConfigList;
    }

    public SetVodDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetVodDomainStagingConfigResponseBodyDomainConfigList extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("FunctionName")
        public String functionName;

        public static SetVodDomainStagingConfigResponseBodyDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            SetVodDomainStagingConfigResponseBodyDomainConfigList self = new SetVodDomainStagingConfigResponseBodyDomainConfigList();
            return TeaModel.build(map, self);
        }

        public SetVodDomainStagingConfigResponseBodyDomainConfigList setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public SetVodDomainStagingConfigResponseBodyDomainConfigList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SetVodDomainStagingConfigResponseBodyDomainConfigList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
