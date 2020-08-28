// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MediaSnapshot")
    @Validation(required = true)
    public ListSnapshotsResponseMediaSnapshot mediaSnapshot;

    public static ListSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponse self = new ListSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListSnapshotsResponseMediaSnapshotSnapshotsSnapshot extends TeaModel {
        @NameInMap("Index")
        @Validation(required = true)
        public Long index;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static ListSnapshotsResponseMediaSnapshotSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseMediaSnapshotSnapshotsSnapshot self = new ListSnapshotsResponseMediaSnapshotSnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

    }

    public static class ListSnapshotsResponseMediaSnapshotSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<ListSnapshotsResponseMediaSnapshotSnapshotsSnapshot> snapshot;

        public static ListSnapshotsResponseMediaSnapshotSnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseMediaSnapshotSnapshots self = new ListSnapshotsResponseMediaSnapshotSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class ListSnapshotsResponseMediaSnapshot extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("Regular")
        @Validation(required = true)
        public String regular;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public ListSnapshotsResponseMediaSnapshotSnapshots snapshots;

        public static ListSnapshotsResponseMediaSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotsResponseMediaSnapshot self = new ListSnapshotsResponseMediaSnapshot();
            return TeaModel.build(map, self);
        }

    }

}
