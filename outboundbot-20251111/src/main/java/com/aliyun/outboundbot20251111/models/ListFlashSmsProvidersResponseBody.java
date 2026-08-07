// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListFlashSmsProvidersResponseBody extends TeaModel {
    /**
     * <p>返回码</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFlashSmsProvidersResponseBodyData> data;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>错误信息</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=outb003</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>错误信息中的变量值列表</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFlashSmsProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsProvidersResponseBody self = new ListFlashSmsProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlashSmsProvidersResponseBody setData(java.util.List<ListFlashSmsProvidersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFlashSmsProvidersResponseBodyData> getData() {
        return this.data;
    }

    public ListFlashSmsProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlashSmsProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlashSmsProvidersResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListFlashSmsProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlashSmsProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlashSmsProvidersResponseBodyData extends TeaModel {
        /**
         * <p>配置schema</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Pwd\&quot;:{\&quot;displayName\&quot;:\&quot;密码\&quot;,\&quot;dataType\&quot;:\&quot;TEXT\&quot;,\&quot;displayOrder\&quot;:2,\&quot;required\&quot;:true,\&quot;maxLength\&quot;:64},\&quot;User\&quot;:{\&quot;displayName\&quot;:\&quot;用户\&quot;,\&quot;dataType\&quot;:\&quot;TEXT\&quot;,\&quot;displayOrder\&quot;:1,\&quot;required\&quot;:true,\&quot;maxLength\&quot;:64},\&quot;Account\&quot;:{\&quot;displayName\&quot;:\&quot;账号\&quot;,\&quot;dataType\&quot;:\&quot;TEXT\&quot;,\&quot;displayOrder\&quot;:3,\&quot;required\&quot;:true,\&quot;maxLength\&quot;:64}}</p>
         */
        @NameInMap("ProfileSchema")
        public String profileSchema;

        /**
         * <p>供应商ID</p>
         * 
         * <strong>example:</strong>
         * <p>Uincall</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <p>供应商名称</p>
         * 
         * <strong>example:</strong>
         * <p>北京优音通信有限公司</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        public static ListFlashSmsProvidersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsProvidersResponseBodyData self = new ListFlashSmsProvidersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsProvidersResponseBodyData setProfileSchema(String profileSchema) {
            this.profileSchema = profileSchema;
            return this;
        }
        public String getProfileSchema() {
            return this.profileSchema;
        }

        public ListFlashSmsProvidersResponseBodyData setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public ListFlashSmsProvidersResponseBodyData setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
