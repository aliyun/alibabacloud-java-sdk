// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListSourceFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSourceFileResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSourceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSourceFileResponseBody self = new ListSourceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSourceFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSourceFileResponseBody setData(ListSourceFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSourceFileResponseBodyData getData() {
        return this.data;
    }

    public ListSourceFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSourceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSourceFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSourceFileResponseBodyDataPicList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ListSourceFileResponseBodyDataPicList build(java.util.Map<String, ?> map) throws Exception {
            ListSourceFileResponseBodyDataPicList self = new ListSourceFileResponseBodyDataPicList();
            return TeaModel.build(map, self);
        }

        public ListSourceFileResponseBodyDataPicList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSourceFileResponseBodyDataPicList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListSourceFileResponseBodyDataPicList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSourceFileResponseBodyDataPicList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSourceFileResponseBodyDataPicList setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListSourceFileResponseBodyDataPicList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSourceFileResponseBodyDataPicList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListSourceFileResponseBodyDataVideoList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ListSourceFileResponseBodyDataVideoList build(java.util.Map<String, ?> map) throws Exception {
            ListSourceFileResponseBodyDataVideoList self = new ListSourceFileResponseBodyDataVideoList();
            return TeaModel.build(map, self);
        }

        public ListSourceFileResponseBodyDataVideoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSourceFileResponseBodyDataVideoList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListSourceFileResponseBodyDataVideoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSourceFileResponseBodyDataVideoList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSourceFileResponseBodyDataVideoList setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListSourceFileResponseBodyDataVideoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSourceFileResponseBodyDataVideoList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListSourceFileResponseBodyData extends TeaModel {
        @NameInMap("PicList")
        public java.util.List<ListSourceFileResponseBodyDataPicList> picList;

        @NameInMap("VideoList")
        public java.util.List<ListSourceFileResponseBodyDataVideoList> videoList;

        public static ListSourceFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSourceFileResponseBodyData self = new ListSourceFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSourceFileResponseBodyData setPicList(java.util.List<ListSourceFileResponseBodyDataPicList> picList) {
            this.picList = picList;
            return this;
        }
        public java.util.List<ListSourceFileResponseBodyDataPicList> getPicList() {
            return this.picList;
        }

        public ListSourceFileResponseBodyData setVideoList(java.util.List<ListSourceFileResponseBodyDataVideoList> videoList) {
            this.videoList = videoList;
            return this;
        }
        public java.util.List<ListSourceFileResponseBodyDataVideoList> getVideoList() {
            return this.videoList;
        }

    }

}
