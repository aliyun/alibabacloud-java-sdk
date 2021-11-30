// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListLiveChannelResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("LiveChannel")
    public java.util.List<LiveChannel> liveChannels;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxKeys")
    public Long maxKeys;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("Prefix")
    public String prefix;

    public static ListLiveChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveChannelResponseBody self = new ListLiveChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveChannelResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListLiveChannelResponseBody setLiveChannels(java.util.List<LiveChannel> liveChannels) {
        this.liveChannels = liveChannels;
        return this;
    }
    public java.util.List<LiveChannel> getLiveChannels() {
        return this.liveChannels;
    }

    public ListLiveChannelResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListLiveChannelResponseBody setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListLiveChannelResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListLiveChannelResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
