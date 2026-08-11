// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListFlashSmsAccessProfilesResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public ListFlashSmsAccessProfilesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=outb001</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFlashSmsAccessProfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsAccessProfilesResponseBody self = new ListFlashSmsAccessProfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsAccessProfilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlashSmsAccessProfilesResponseBody setData(ListFlashSmsAccessProfilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlashSmsAccessProfilesResponseBodyData getData() {
        return this.data;
    }

    public ListFlashSmsAccessProfilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlashSmsAccessProfilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlashSmsAccessProfilesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListFlashSmsAccessProfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlashSmsAccessProfilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles extends TeaModel {
        /**
         * <p>The provider configuration information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiId&quot;:&quot;100235&quot;,&quot;apiKey&quot;:&quot;3aRsPrTsDG3OPNq5&quot;,&quot;aesKey&quot;:&quot;TQChVEAabhaNp2AB&quot;,&quot;capAppId&quot;:&quot;300012117547&quot;}</p>
         */
        @NameInMap("AccessProfile")
        public String accessProfile;

        /**
         * <p>The flash SMS configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        /**
         * <p>The creation time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The provider ID. Valid values:\
         * Uincall: Beijing Youyin Communication Co., Ltd.\
         * ChuangLan: Beijing ChuangLan Cloud Intelligence Information Co., Ltd.\
         * ChinaMobile: China Mobile.\
         * ShangHaiTianNan: Shanghai Tiannan.\
         * HeDao: Galexis.\
         * DySms: Alibaba Communication.</p>
         * 
         * <strong>example:</strong>
         * <p>Uincall</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <p>The provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>北京优音通信有限公司</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <p>The update time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles self = new ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles setAccessProfile(String accessProfile) {
            this.accessProfile = accessProfile;
            return this;
        }
        public String getAccessProfile() {
            return this.accessProfile;
        }

        public ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

        public ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListFlashSmsAccessProfilesResponseBodyData extends TeaModel {
        /**
         * <p>The data list.</p>
         */
        @NameInMap("FlashSmsAccessProfiles")
        public java.util.List<ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles> flashSmsAccessProfiles;

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFlashSmsAccessProfilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsAccessProfilesResponseBodyData self = new ListFlashSmsAccessProfilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsAccessProfilesResponseBodyData setFlashSmsAccessProfiles(java.util.List<ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles> flashSmsAccessProfiles) {
            this.flashSmsAccessProfiles = flashSmsAccessProfiles;
            return this;
        }
        public java.util.List<ListFlashSmsAccessProfilesResponseBodyDataFlashSmsAccessProfiles> getFlashSmsAccessProfiles() {
            return this.flashSmsAccessProfiles;
        }

        public ListFlashSmsAccessProfilesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFlashSmsAccessProfilesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFlashSmsAccessProfilesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
