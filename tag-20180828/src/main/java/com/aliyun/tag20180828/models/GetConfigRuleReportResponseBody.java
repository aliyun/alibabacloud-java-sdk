// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetConfigRuleReportResponseBody extends TeaModel {
    /**
     * <p>The basic information of the resource non-compliance report that is last generated.</p>
     */
    @NameInMap("Data")
    public GetConfigRuleReportResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetConfigRuleReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleReportResponseBody self = new GetConfigRuleReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleReportResponseBody setData(GetConfigRuleReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConfigRuleReportResponseBodyData getData() {
        return this.data;
    }

    public GetConfigRuleReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConfigRuleReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConfigRuleReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConfigRuleReportResponseBodyData extends TeaModel {
        /**
         * <p>The time when the report was generated. This value is a UNIX timestamp.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The ID of the report.</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The ID of the object.</p>
         * <br>
         * <p>>  This parameter is returned if you set the `TargetType` and `TargetId` parameters in the current request to the same values as the parameters that are configured when you call the [GenerateConfigRuleReport](~~433313~~) operation to generate the report.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The type of the object. Valid values:</p>
         * <br>
         * <p>*   USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</p>
         * <p>*   ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         * <p>*   FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         * <p>*   ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
         * <br>
         * <p>>  This parameter is returned if you set the `TargetType` and `TargetId` parameters in the current request to the same values as the parameters that are configured when you call the [GenerateConfigRuleReport](~~433313~~) operation to generate the report.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static GetConfigRuleReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleReportResponseBodyData self = new GetConfigRuleReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleReportResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetConfigRuleReportResponseBodyData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetConfigRuleReportResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetConfigRuleReportResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
