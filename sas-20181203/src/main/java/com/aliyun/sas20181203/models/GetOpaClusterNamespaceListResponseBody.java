// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterNamespaceListResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The namespaces.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetOpaClusterNamespaceListResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOpaClusterNamespaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterNamespaceListResponseBody self = new GetOpaClusterNamespaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterNamespaceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpaClusterNamespaceListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetOpaClusterNamespaceListResponseBody setData(java.util.List<GetOpaClusterNamespaceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOpaClusterNamespaceListResponseBodyData> getData() {
        return this.data;
    }

    public GetOpaClusterNamespaceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpaClusterNamespaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpaClusterNamespaceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpaClusterNamespaceListResponseBodyData extends TeaModel {
        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("NameSpaceName")
        public String nameSpaceName;

        public static GetOpaClusterNamespaceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOpaClusterNamespaceListResponseBodyData self = new GetOpaClusterNamespaceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOpaClusterNamespaceListResponseBodyData setNameSpaceName(String nameSpaceName) {
            this.nameSpaceName = nameSpaceName;
            return this;
        }
        public String getNameSpaceName() {
            return this.nameSpaceName;
        }

    }

}
