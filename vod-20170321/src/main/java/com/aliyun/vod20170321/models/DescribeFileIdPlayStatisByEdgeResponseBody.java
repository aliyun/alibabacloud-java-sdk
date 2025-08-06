// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeFileIdPlayStatisByEdgeResponseBody extends TeaModel {
    @NameInMap("FilePlayStatisList")
    public java.util.List<DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList> filePlayStatisList;

    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScrollToken")
    public String scrollToken;

    public static DescribeFileIdPlayStatisByEdgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileIdPlayStatisByEdgeResponseBody self = new DescribeFileIdPlayStatisByEdgeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileIdPlayStatisByEdgeResponseBody setFilePlayStatisList(java.util.List<DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList> filePlayStatisList) {
        this.filePlayStatisList = filePlayStatisList;
        return this;
    }
    public java.util.List<DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList> getFilePlayStatisList() {
        return this.filePlayStatisList;
    }

    public DescribeFileIdPlayStatisByEdgeResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public DescribeFileIdPlayStatisByEdgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileIdPlayStatisByEdgeResponseBody setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public static class DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("Flux")
        public Long flux;

        @NameInMap("PlayCount")
        public Long playCount;

        @NameInMap("RequestCount")
        public Long requestCount;

        @NameInMap("StatisTime")
        public String statisTime;

        public static DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList self = new DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList();
            return TeaModel.build(map, self);
        }

        public DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList setFlux(Long flux) {
            this.flux = flux;
            return this;
        }
        public Long getFlux() {
            return this.flux;
        }

        public DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList setPlayCount(Long playCount) {
            this.playCount = playCount;
            return this;
        }
        public Long getPlayCount() {
            return this.playCount;
        }

        public DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public DescribeFileIdPlayStatisByEdgeResponseBodyFilePlayStatisList setStatisTime(String statisTime) {
            this.statisTime = statisTime;
            return this;
        }
        public String getStatisTime() {
            return this.statisTime;
        }

    }

}
