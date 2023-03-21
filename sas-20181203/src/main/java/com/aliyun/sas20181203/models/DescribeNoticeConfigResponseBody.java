// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNoticeConfigResponseBody extends TeaModel {
    @NameInMap("NoticeConfigList")
    public java.util.List<DescribeNoticeConfigResponseBodyNoticeConfigList> noticeConfigList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNoticeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNoticeConfigResponseBody self = new DescribeNoticeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNoticeConfigResponseBody setNoticeConfigList(java.util.List<DescribeNoticeConfigResponseBodyNoticeConfigList> noticeConfigList) {
        this.noticeConfigList = noticeConfigList;
        return this;
    }
    public java.util.List<DescribeNoticeConfigResponseBodyNoticeConfigList> getNoticeConfigList() {
        return this.noticeConfigList;
    }

    public DescribeNoticeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNoticeConfigResponseBodyNoticeConfigList extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Project")
        public String project;

        @NameInMap("Route")
        public Integer route;

        @NameInMap("TimeLimit")
        public Integer timeLimit;

        public static DescribeNoticeConfigResponseBodyNoticeConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNoticeConfigResponseBodyNoticeConfigList self = new DescribeNoticeConfigResponseBodyNoticeConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setRoute(Integer route) {
            this.route = route;
            return this;
        }
        public Integer getRoute() {
            return this.route;
        }

        public DescribeNoticeConfigResponseBodyNoticeConfigList setTimeLimit(Integer timeLimit) {
            this.timeLimit = timeLimit;
            return this;
        }
        public Integer getTimeLimit() {
            return this.timeLimit;
        }

    }

}
