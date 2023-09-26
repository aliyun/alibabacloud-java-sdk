// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterLabelListResponseBody extends TeaModel {
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
     * <p>The information about the tags that are added to containers.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetOpaClusterLabelListResponseBodyData> data;

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

    public static GetOpaClusterLabelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterLabelListResponseBody self = new GetOpaClusterLabelListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterLabelListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpaClusterLabelListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetOpaClusterLabelListResponseBody setData(java.util.List<GetOpaClusterLabelListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOpaClusterLabelListResponseBodyData> getData() {
        return this.data;
    }

    public GetOpaClusterLabelListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpaClusterLabelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpaClusterLabelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpaClusterLabelListResponseBodyData extends TeaModel {
        /**
         * <p>The name of the tag that is added to the container.</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static GetOpaClusterLabelListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOpaClusterLabelListResponseBodyData self = new GetOpaClusterLabelListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOpaClusterLabelListResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
