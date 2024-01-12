// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListMotionShopTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListMotionShopTasksResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListMotionShopTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMotionShopTasksResponseBody self = new ListMotionShopTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMotionShopTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMotionShopTasksResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListMotionShopTasksResponseBody setData(java.util.List<ListMotionShopTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMotionShopTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListMotionShopTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMotionShopTasksResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public ListMotionShopTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMotionShopTasksResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListMotionShopTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMotionShopTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListMotionShopTasksResponseBodyDataMaterial extends TeaModel {
        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("Box")
        public java.util.List<Double> box;

        @NameInMap("CoverUrl")
        public String coverUrl;

        public static ListMotionShopTasksResponseBodyDataMaterial build(java.util.Map<String, ?> map) throws Exception {
            ListMotionShopTasksResponseBodyDataMaterial self = new ListMotionShopTasksResponseBodyDataMaterial();
            return TeaModel.build(map, self);
        }

        public ListMotionShopTasksResponseBodyDataMaterial setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public ListMotionShopTasksResponseBodyDataMaterial setBox(java.util.List<Double> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Double> getBox() {
            return this.box;
        }

        public ListMotionShopTasksResponseBodyDataMaterial setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

    }

    public static class ListMotionShopTasksResponseBodyDataResult extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("ShareUrl")
        public String shareUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ListMotionShopTasksResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListMotionShopTasksResponseBodyDataResult self = new ListMotionShopTasksResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListMotionShopTasksResponseBodyDataResult setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListMotionShopTasksResponseBodyDataResult setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
            return this;
        }
        public String getShareUrl() {
            return this.shareUrl;
        }

        public ListMotionShopTasksResponseBodyDataResult setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListMotionShopTasksResponseBodyData extends TeaModel {
        @NameInMap("Material")
        public ListMotionShopTasksResponseBodyDataMaterial material;

        @NameInMap("Result")
        public ListMotionShopTasksResponseBodyDataResult result;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static ListMotionShopTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMotionShopTasksResponseBodyData self = new ListMotionShopTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMotionShopTasksResponseBodyData setMaterial(ListMotionShopTasksResponseBodyDataMaterial material) {
            this.material = material;
            return this;
        }
        public ListMotionShopTasksResponseBodyDataMaterial getMaterial() {
            return this.material;
        }

        public ListMotionShopTasksResponseBodyData setResult(ListMotionShopTasksResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ListMotionShopTasksResponseBodyDataResult getResult() {
            return this.result;
        }

        public ListMotionShopTasksResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMotionShopTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
