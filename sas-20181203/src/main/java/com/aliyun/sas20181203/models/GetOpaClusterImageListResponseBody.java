// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterImageListResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of images returned on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The information about the images.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetOpaClusterImageListResponseBodyData> data;

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

    public static GetOpaClusterImageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterImageListResponseBody self = new GetOpaClusterImageListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterImageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpaClusterImageListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetOpaClusterImageListResponseBody setData(java.util.List<GetOpaClusterImageListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOpaClusterImageListResponseBodyData> getData() {
        return this.data;
    }

    public GetOpaClusterImageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpaClusterImageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpaClusterImageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpaClusterImageListResponseBodyData extends TeaModel {
        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        public static GetOpaClusterImageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOpaClusterImageListResponseBodyData self = new GetOpaClusterImageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOpaClusterImageListResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

    }

}
