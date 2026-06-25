// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListK8sResourceResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li>An array of k8s resources.</li>
     * </ul>
     */
    @NameInMap("Data")
    public java.util.List<ListK8sResourceResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2ECA6FC9-7557-5576-AF5F-FC3E7BCC9C21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListK8sResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sResourceResponseBody self = new ListK8sResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8sResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListK8sResourceResponseBody setData(java.util.List<ListK8sResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListK8sResourceResponseBodyData> getData() {
        return this.data;
    }

    public ListK8sResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListK8sResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListK8sResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListK8sResourceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the k8s resource.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-01632622cda2f</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the k8s resource.</p>
         * 
         * <strong>example:</strong>
         * <p>q_ecs_enterprise_spot_c</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        public static ListK8sResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListK8sResourceResponseBodyData self = new ListK8sResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListK8sResourceResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListK8sResourceResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

}
