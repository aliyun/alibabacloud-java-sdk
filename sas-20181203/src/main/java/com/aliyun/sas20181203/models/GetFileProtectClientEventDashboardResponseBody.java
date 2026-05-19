// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientEventDashboardResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileProtectClientEventDashboardResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectClientEventDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientEventDashboardResponseBody self = new GetFileProtectClientEventDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientEventDashboardResponseBody setData(GetFileProtectClientEventDashboardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileProtectClientEventDashboardResponseBodyData getData() {
        return this.data;
    }

    public GetFileProtectClientEventDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileProtectClientEventDashboardResponseBodyDataFilePathStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/usr/a</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Num")
        public Long num;

        public static GetFileProtectClientEventDashboardResponseBodyDataFilePathStats build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectClientEventDashboardResponseBodyDataFilePathStats self = new GetFileProtectClientEventDashboardResponseBodyDataFilePathStats();
            return TeaModel.build(map, self);
        }

        public GetFileProtectClientEventDashboardResponseBodyDataFilePathStats setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFileProtectClientEventDashboardResponseBodyDataFilePathStats setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

    }

    public static class GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Num")
        public Long num;

        public static GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats self = new GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats();
            return TeaModel.build(map, self);
        }

        public GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

    }

    public static class GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Num")
        public Long num;

        public static GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats self = new GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats();
            return TeaModel.build(map, self);
        }

        public GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

    }

    public static class GetFileProtectClientEventDashboardResponseBodyData extends TeaModel {
        @NameInMap("FilePathStats")
        public java.util.List<GetFileProtectClientEventDashboardResponseBodyDataFilePathStats> filePathStats;

        @NameInMap("FileTypeStats")
        public java.util.List<GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats> fileTypeStats;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("OneDayFileChangeCount")
        public Integer oneDayFileChangeCount;

        @NameInMap("ProcessNameStats")
        public java.util.List<GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats> processNameStats;

        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("RecentFileChangeCount")
        public Integer recentFileChangeCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ServerCount")
        public Integer serverCount;

        public static GetFileProtectClientEventDashboardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectClientEventDashboardResponseBodyData self = new GetFileProtectClientEventDashboardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileProtectClientEventDashboardResponseBodyData setFilePathStats(java.util.List<GetFileProtectClientEventDashboardResponseBodyDataFilePathStats> filePathStats) {
            this.filePathStats = filePathStats;
            return this;
        }
        public java.util.List<GetFileProtectClientEventDashboardResponseBodyDataFilePathStats> getFilePathStats() {
            return this.filePathStats;
        }

        public GetFileProtectClientEventDashboardResponseBodyData setFileTypeStats(java.util.List<GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats> fileTypeStats) {
            this.fileTypeStats = fileTypeStats;
            return this;
        }
        public java.util.List<GetFileProtectClientEventDashboardResponseBodyDataFileTypeStats> getFileTypeStats() {
            return this.fileTypeStats;
        }

        public GetFileProtectClientEventDashboardResponseBodyData setOneDayFileChangeCount(Integer oneDayFileChangeCount) {
            this.oneDayFileChangeCount = oneDayFileChangeCount;
            return this;
        }
        public Integer getOneDayFileChangeCount() {
            return this.oneDayFileChangeCount;
        }

        public GetFileProtectClientEventDashboardResponseBodyData setProcessNameStats(java.util.List<GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats> processNameStats) {
            this.processNameStats = processNameStats;
            return this;
        }
        public java.util.List<GetFileProtectClientEventDashboardResponseBodyDataProcessNameStats> getProcessNameStats() {
            return this.processNameStats;
        }

        public GetFileProtectClientEventDashboardResponseBodyData setRecentFileChangeCount(Integer recentFileChangeCount) {
            this.recentFileChangeCount = recentFileChangeCount;
            return this;
        }
        public Integer getRecentFileChangeCount() {
            return this.recentFileChangeCount;
        }

        public GetFileProtectClientEventDashboardResponseBodyData setServerCount(Integer serverCount) {
            this.serverCount = serverCount;
            return this;
        }
        public Integer getServerCount() {
            return this.serverCount;
        }

    }

}
