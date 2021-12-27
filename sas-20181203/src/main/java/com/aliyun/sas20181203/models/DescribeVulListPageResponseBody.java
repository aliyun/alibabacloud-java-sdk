// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListPageResponseBody extends TeaModel {
    // 返回参数
    @NameInMap("Data")
    public java.util.List<DescribeVulListPageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulListPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListPageResponseBody self = new DescribeVulListPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulListPageResponseBody setData(java.util.List<DescribeVulListPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeVulListPageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeVulListPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulListPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulListPageResponseBodyData extends TeaModel {
        // cveId
        @NameInMap("CveId")
        public String cveId;

        // id
        @NameInMap("Id")
        public Long id;

        // 是否安骑士扫描
        @NameInMap("IsAegis")
        public Integer isAegis;

        // 是否网络扫描
        @NameInMap("IsSas")
        public Integer isSas;

        // 编号
        @NameInMap("OtherId")
        public String otherId;

        // 发布时间
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        // 漏洞标题
        @NameInMap("Title")
        public String title;

        public static DescribeVulListPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListPageResponseBodyData self = new DescribeVulListPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVulListPageResponseBodyData setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulListPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVulListPageResponseBodyData setIsAegis(Integer isAegis) {
            this.isAegis = isAegis;
            return this;
        }
        public Integer getIsAegis() {
            return this.isAegis;
        }

        public DescribeVulListPageResponseBodyData setIsSas(Integer isSas) {
            this.isSas = isSas;
            return this;
        }
        public Integer getIsSas() {
            return this.isSas;
        }

        public DescribeVulListPageResponseBodyData setOtherId(String otherId) {
            this.otherId = otherId;
            return this;
        }
        public String getOtherId() {
            return this.otherId;
        }

        public DescribeVulListPageResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeVulListPageResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
