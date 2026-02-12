// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsRegionListResponseBody extends TeaModel {
    @NameInMap("Data")
    public OnsRegionListResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>72D14A84-45E5-4E01-A6DB-F63C4721****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsRegionListResponseBody self = new OnsRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsRegionListResponseBody setData(OnsRegionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsRegionListResponseBodyData getData() {
        return this.data;
    }

    public OnsRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsRegionListResponseBodyDataRegionDo extends TeaModel {
        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OnsRegionId")
        public String onsRegionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static OnsRegionListResponseBodyDataRegionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsRegionListResponseBodyDataRegionDo self = new OnsRegionListResponseBodyDataRegionDo();
            return TeaModel.build(map, self);
        }

        public OnsRegionListResponseBodyDataRegionDo setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public OnsRegionListResponseBodyDataRegionDo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsRegionListResponseBodyDataRegionDo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OnsRegionListResponseBodyDataRegionDo setOnsRegionId(String onsRegionId) {
            this.onsRegionId = onsRegionId;
            return this;
        }
        public String getOnsRegionId() {
            return this.onsRegionId;
        }

        public OnsRegionListResponseBodyDataRegionDo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public OnsRegionListResponseBodyDataRegionDo setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class OnsRegionListResponseBodyData extends TeaModel {
        @NameInMap("RegionDo")
        public java.util.List<OnsRegionListResponseBodyDataRegionDo> regionDo;

        public static OnsRegionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsRegionListResponseBodyData self = new OnsRegionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsRegionListResponseBodyData setRegionDo(java.util.List<OnsRegionListResponseBodyDataRegionDo> regionDo) {
            this.regionDo = regionDo;
            return this;
        }
        public java.util.List<OnsRegionListResponseBodyDataRegionDo> getRegionDo() {
            return this.regionDo;
        }

    }

}
