// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The URL of the snapshot.</p>
     */
    @NameInMap("MediaSnapshot")
    public ListSnapshotsResponseBodyMediaSnapshot mediaSnapshot;

    /**
     * <p>The snapshot data of the media.</p>
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
        @NameInMap("Index")
        public Long index;

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
         * <p>The ID of the snapshot job.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Queries the snapshots that are captured from the specified media.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Regular")
        public String regular;

        @NameInMap("Snapshots")
        public ListSnapshotsResponseBodyMediaSnapshotSnapshots snapshots;

        /**
         * <p>The total number of snapshots.</p>
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
