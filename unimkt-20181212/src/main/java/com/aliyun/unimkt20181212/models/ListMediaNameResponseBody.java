// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListMediaNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListMediaNameResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListMediaNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaNameResponseBody self = new ListMediaNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMediaNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMediaNameResponseBody setModel(java.util.List<ListMediaNameResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListMediaNameResponseBodyModel> getModel() {
        return this.model;
    }

    public ListMediaNameResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMediaNameResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMediaNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMediaNameResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListMediaNameResponseBodyModel extends TeaModel {
        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        public static ListMediaNameResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListMediaNameResponseBodyModel self = new ListMediaNameResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListMediaNameResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaNameResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

    }

}
