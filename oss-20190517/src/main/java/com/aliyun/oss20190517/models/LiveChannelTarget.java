// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveChannelTarget extends TeaModel {
    @NameInMap("FragCount")
    public Long fragCount;

    @NameInMap("FragDuration")
    public Long fragDuration;

    @NameInMap("PlaylistName")
    public String playlistName;

    @NameInMap("Type")
    public String type;

    public static LiveChannelTarget build(java.util.Map<String, ?> map) throws Exception {
        LiveChannelTarget self = new LiveChannelTarget();
        return TeaModel.build(map, self);
    }

    public LiveChannelTarget setFragCount(Long fragCount) {
        this.fragCount = fragCount;
        return this;
    }
    public Long getFragCount() {
        return this.fragCount;
    }

    public LiveChannelTarget setFragDuration(Long fragDuration) {
        this.fragDuration = fragDuration;
        return this;
    }
    public Long getFragDuration() {
        return this.fragDuration;
    }

    public LiveChannelTarget setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
        return this;
    }
    public String getPlaylistName() {
        return this.playlistName;
    }

    public LiveChannelTarget setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
