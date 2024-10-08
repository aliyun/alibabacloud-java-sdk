// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The information about the snapshot.</p>
     */
    @NameInMap("MediaSnapshot")
    public ListSnapshotsResponseBodyMediaSnapshot mediaSnapshot;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponseBody self = new ListSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponseBody setMediaSnapshot(ListSnapshotsResponseBodyMediaSnapshot mediaSnapshot) {
        this.mediaSnapshot = mediaSnapshot;
        return this;
    }
    public ListSnapshotsResponseBodyMediaSnapshot getMediaSnapshot() {
        return this.mediaSnapshot;
    }

    public ListSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot extends TeaModel {
        /**
         * <p>The index of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The URL of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/snapshot/sample00001****.jpg">http://example.aliyundoc.com/snapshot/sample00001****.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot self = new ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListSnapshotsResponseBodyMediaSnapshotSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot> snapshot;

        public static ListSnapshotsResponseBodyMediaSnapshotSnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodyMediaSnapshotSnapshots self = new ListSnapshotsResponseBodyMediaSnapshotSnapshots();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodyMediaSnapshotSnapshots setSnapshot(java.util.List<ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<ListSnapshotsResponseBodyMediaSnapshotSnapshotsSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class ListSnapshotsResponseBodyMediaSnapshot extends TeaModel {
        /**
         * <p>The time when the snapshot job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-20T12:23:45Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the snapshot job.</p>
         * 
         * <strong>example:</strong>
         * <p>ad90a501b1b9472374ad005046****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The rule used to generate snapshot URLs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/snapshot/sample%7BSnapshotCount%7D.jpg">http://example.aliyundoc.com/snapshot/sample{SnapshotCount}.jpg</a></p>
         */
        @NameInMap("Regular")
        public String regular;

        /**
         * <p>The details of the snapshot.</p>
         */
        @NameInMap("Snapshots")
        public ListSnapshotsResponseBodyMediaSnapshotSnapshots snapshots;

        /**
         * <p>The total number of snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSnapshotsResponseBodyMediaSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseBodyMediaSnapshot self = new ListSnapshotsResponseBodyMediaSnapshot();
            return TeaModel.build(map, self);
        }

        public ListSnapshotsResponseBodyMediaSnapshot setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListSnapshotsResponseBodyMediaSnapshot setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSnapshotsResponseBodyMediaSnapshot setRegular(String regular) {
            this.regular = regular;
            return this;
        }
        public String getRegular() {
            return this.regular;
        }

        public ListSnapshotsResponseBodyMediaSnapshot setSnapshots(ListSnapshotsResponseBodyMediaSnapshotSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public ListSnapshotsResponseBodyMediaSnapshotSnapshots getSnapshots() {
            return this.snapshots;
        }

        public ListSnapshotsResponseBodyMediaSnapshot setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
