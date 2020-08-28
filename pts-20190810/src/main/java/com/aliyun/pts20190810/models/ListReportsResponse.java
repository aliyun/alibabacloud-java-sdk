// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListReportsResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Reports")
    @Validation(required = true)
    public java.util.List<ListReportsResponseReports> reports;

    public static ListReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReportsResponse self = new ListReportsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListReportsResponseReports extends TeaModel {
        @NameInMap("ReportId")
        @Validation(required = true)
        public String reportId;

        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        @NameInMap("SceneName")
        @Validation(required = true)
        public String sceneName;

        @NameInMap("SceneType")
        @Validation(required = true)
        public String sceneType;

        @NameInMap("MaxConcurrency")
        @Validation(required = true)
        public Integer maxConcurrency;

        @NameInMap("Vum")
        @Validation(required = true)
        public Integer vum;

        @NameInMap("Duration")
        @Validation(required = true)
        public String duration;

        @NameInMap("BeginTime")
        @Validation(required = true)
        public Long beginTime;

        @NameInMap("SceneDeleted")
        @Validation(required = true)
        public Boolean sceneDeleted;

        @NameInMap("RequestId")
        @Validation(required = true)
        public String requestId;

        public static ListReportsResponseReports build(java.util.Map<String, ?> map) throws Exception {
            ListReportsResponseReports self = new ListReportsResponseReports();
            return TeaModel.build(map, self);
        }

    }

}
