// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsRequest extends TeaModel {
    @NameInMap("Definitions")
    public String definitions;

    @NameInMap("Formats")
    public String formats;

    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("SliceCount")
    public Integer sliceCount;

    @NameInMap("SliceFlag")
    public Boolean sliceFlag;

    @NameInMap("StreamType")
    public String streamType;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("UserData")
    public String userData;

    public static RefreshMediaPlayUrlsRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshMediaPlayUrlsRequest self = new RefreshMediaPlayUrlsRequest();
        return TeaModel.build(map, self);
    }

    public RefreshMediaPlayUrlsRequest setDefinitions(String definitions) {
        this.definitions = definitions;
        return this;
    }
    public String getDefinitions() {
        return this.definitions;
    }

    public RefreshMediaPlayUrlsRequest setFormats(String formats) {
        this.formats = formats;
        return this;
    }
    public String getFormats() {
        return this.formats;
    }

    public RefreshMediaPlayUrlsRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public RefreshMediaPlayUrlsRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public RefreshMediaPlayUrlsRequest setSliceCount(Integer sliceCount) {
        this.sliceCount = sliceCount;
        return this;
    }
    public Integer getSliceCount() {
        return this.sliceCount;
    }

    public RefreshMediaPlayUrlsRequest setSliceFlag(Boolean sliceFlag) {
        this.sliceFlag = sliceFlag;
        return this;
    }
    public Boolean getSliceFlag() {
        return this.sliceFlag;
    }

    public RefreshMediaPlayUrlsRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

    public RefreshMediaPlayUrlsRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public RefreshMediaPlayUrlsRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
