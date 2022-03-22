// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchSetScdnDomainConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigList")
    public BatchSetScdnDomainConfigsResponseBodyDomainConfigList domainConfigList;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetScdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetScdnDomainConfigsResponseBody self = new BatchSetScdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetScdnDomainConfigsResponseBody setDomainConfigList(BatchSetScdnDomainConfigsResponseBodyDomainConfigList domainConfigList) {
        this.domainConfigList = domainConfigList;
        return this;
    }
    public BatchSetScdnDomainConfigsResponseBodyDomainConfigList getDomainConfigList() {
        return this.domainConfigList;
    }

    public BatchSetScdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("FunctionName")
        public String functionName;

        public static BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel build(java.util.Map<String, ?> map) throws Exception {
            BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel self = new BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel();
            return TeaModel.build(map, self);
        }

        public BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

    public static class BatchSetScdnDomainConfigsResponseBodyDomainConfigList extends TeaModel {
        @NameInMap("DomainConfigModel")
        public java.util.List<BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel> domainConfigModel;

        public static BatchSetScdnDomainConfigsResponseBodyDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchSetScdnDomainConfigsResponseBodyDomainConfigList self = new BatchSetScdnDomainConfigsResponseBodyDomainConfigList();
            return TeaModel.build(map, self);
        }

        public BatchSetScdnDomainConfigsResponseBodyDomainConfigList setDomainConfigModel(java.util.List<BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel> domainConfigModel) {
            this.domainConfigModel = domainConfigModel;
            return this;
        }
        public java.util.List<BatchSetScdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel> getDomainConfigModel() {
            return this.domainConfigModel;
        }

    }

}
