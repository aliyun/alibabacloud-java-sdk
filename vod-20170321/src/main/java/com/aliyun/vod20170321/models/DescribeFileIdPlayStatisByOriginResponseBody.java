// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeFileIdPlayStatisByOriginResponseBody extends TeaModel {
    @NameInMap("FilePlayStatisList")
    public java.util.List<DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList> filePlayStatisList;

    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScrollToken")
    public String scrollToken;

    public static DescribeFileIdPlayStatisByOriginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileIdPlayStatisByOriginResponseBody self = new DescribeFileIdPlayStatisByOriginResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileIdPlayStatisByOriginResponseBody setFilePlayStatisList(java.util.List<DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList> filePlayStatisList) {
        this.filePlayStatisList = filePlayStatisList;
        return this;
    }
    public java.util.List<DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList> getFilePlayStatisList() {
        return this.filePlayStatisList;
    }

    public DescribeFileIdPlayStatisByOriginResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public DescribeFileIdPlayStatisByOriginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileIdPlayStatisByOriginResponseBody setScrollToken(String scrollToken) {
        this.scrollToken = scrollToken;
        return this;
    }
    public String getScrollToken() {
        return this.scrollToken;
    }

    public static class DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList extends TeaModel {
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

        public static DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList self = new DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList();
            return TeaModel.build(map, self);
        }

        public DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList setFlux(Long flux) {
            this.flux = flux;
            return this;
        }
        public Long getFlux() {
            return this.flux;
        }

        public DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList setPlayCount(Long playCount) {
            this.playCount = playCount;
            return this;
        }
        public Long getPlayCount() {
            return this.playCount;
        }

        public DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public DescribeFileIdPlayStatisByOriginResponseBodyFilePlayStatisList setStatisTime(String statisTime) {
            this.statisTime = statisTime;
            return this;
        }
        public String getStatisTime() {
            return this.statisTime;
        }

    }

}
