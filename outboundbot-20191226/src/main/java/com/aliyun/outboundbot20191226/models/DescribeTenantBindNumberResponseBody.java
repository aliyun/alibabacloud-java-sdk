// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTenantBindNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeTenantBindNumberResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTenantBindNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantBindNumberResponseBody self = new DescribeTenantBindNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantBindNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTenantBindNumberResponseBody setData(DescribeTenantBindNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTenantBindNumberResponseBodyData getData() {
        return this.data;
    }

    public DescribeTenantBindNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTenantBindNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTenantBindNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantBindNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTenantBindNumberResponseBodyDataList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IsBinding")
        public Boolean isBinding;

        public static DescribeTenantBindNumberResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantBindNumberResponseBodyDataList self = new DescribeTenantBindNumberResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeTenantBindNumberResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTenantBindNumberResponseBodyDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTenantBindNumberResponseBodyDataList setIsBinding(Boolean isBinding) {
            this.isBinding = isBinding;
            return this;
        }
        public Boolean getIsBinding() {
            return this.isBinding;
        }

    }

    public static class DescribeTenantBindNumberResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<DescribeTenantBindNumberResponseBodyDataList> list;

        public static DescribeTenantBindNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantBindNumberResponseBodyData self = new DescribeTenantBindNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTenantBindNumberResponseBodyData setList(java.util.List<DescribeTenantBindNumberResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeTenantBindNumberResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
