// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAnnotationMissionTagInfoListResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Data")
    public GetAnnotationMissionTagInfoListResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>CDR \&quot;job-efbaeefc-4d45-4e79-83f7-b33b0769c969\&quot; doesn\&quot;t exists.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAnnotationMissionTagInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationMissionTagInfoListResponseBody self = new GetAnnotationMissionTagInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAnnotationMissionTagInfoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAnnotationMissionTagInfoListResponseBody setData(GetAnnotationMissionTagInfoListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAnnotationMissionTagInfoListResponseBodyData getData() {
        return this.data;
    }

    public GetAnnotationMissionTagInfoListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAnnotationMissionTagInfoListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAnnotationMissionTagInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAnnotationMissionTagInfoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList extends TeaModel {
        /**
         * <p>Tag description</p>
         * 
         * <strong>example:</strong>
         * <p>用户投诉</p>
         */
        @NameInMap("AnnotationMissionTagInfoDescription")
        public String annotationMissionTagInfoDescription;

        /**
         * <p>Tag ID</p>
         * 
         * <strong>example:</strong>
         * <p>e1ee87ea-ebad-4079-aebb-1c56a4ef0c06</p>
         */
        @NameInMap("AnnotationMissionTagInfoId")
        public String annotationMissionTagInfoId;

        /**
         * <p>Tag name</p>
         * 
         * <strong>example:</strong>
         * <p>用户投诉</p>
         */
        @NameInMap("AnnotationMissionTagInfoName")
        public String annotationMissionTagInfoName;

        /**
         * <p>Indicates whether the tag is deleted. A value of true indicates that the tag is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>3c3b8d1d-deff-48d9-9318-addc80ae5b1e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Tenant ID</p>
         * 
         * <strong>example:</strong>
         * <p>DING_ORG_dingbd9daecdb7aaed3bffe93478753d9884</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList self = new GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList();
            return TeaModel.build(map, self);
        }

        public GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList setAnnotationMissionTagInfoDescription(String annotationMissionTagInfoDescription) {
            this.annotationMissionTagInfoDescription = annotationMissionTagInfoDescription;
            return this;
        }
        public String getAnnotationMissionTagInfoDescription() {
            return this.annotationMissionTagInfoDescription;
        }

        public GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
            this.annotationMissionTagInfoId = annotationMissionTagInfoId;
            return this;
        }
        public String getAnnotationMissionTagInfoId() {
            return this.annotationMissionTagInfoId;
        }

        public GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
            this.annotationMissionTagInfoName = annotationMissionTagInfoName;
            return this;
        }
        public String getAnnotationMissionTagInfoName() {
            return this.annotationMissionTagInfoName;
        }

        public GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetAnnotationMissionTagInfoListResponseBodyData extends TeaModel {
        /**
         * <p>Tag list</p>
         */
        @NameInMap("AnnotationMissionTagInfoList")
        public java.util.List<GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList> annotationMissionTagInfoList;

        /**
         * <p>Response message</p>
         * 
         * <strong>example:</strong>
         * <p>CDR \&quot;job-efbaeefc-4d45-4e79-83f7-b33b0769c969\&quot; doesn\&quot;t exists.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the call succeeded. A value of true indicates success. A value of false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GetAnnotationMissionTagInfoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAnnotationMissionTagInfoListResponseBodyData self = new GetAnnotationMissionTagInfoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAnnotationMissionTagInfoListResponseBodyData setAnnotationMissionTagInfoList(java.util.List<GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList> annotationMissionTagInfoList) {
            this.annotationMissionTagInfoList = annotationMissionTagInfoList;
            return this;
        }
        public java.util.List<GetAnnotationMissionTagInfoListResponseBodyDataAnnotationMissionTagInfoList> getAnnotationMissionTagInfoList() {
            return this.annotationMissionTagInfoList;
        }

        public GetAnnotationMissionTagInfoListResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAnnotationMissionTagInfoListResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
