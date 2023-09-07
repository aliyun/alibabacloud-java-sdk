// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterNamespaceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<GetOpaClusterNamespaceListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
