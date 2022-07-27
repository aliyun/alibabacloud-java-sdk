// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Patches")
    public java.util.List<ListInstancePatchesResponseBodyPatches> patches;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancePatchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePatchesResponseBody self = new ListInstancePatchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancePatchesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancePatchesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancePatchesResponseBody setPatches(java.util.List<ListInstancePatchesResponseBodyPatches> patches) {
        this.patches = patches;
        return this;
    }
    public java.util.List<ListInstancePatchesResponseBodyPatches> getPatches() {
        return this.patches;
    }

    public ListInstancePatchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancePatchesResponseBodyPatches extends TeaModel {
        @NameInMap("Classification")
        public String classification;

        @NameInMap("InstalledTime")
        public String installedTime;

        @NameInMap("KBId")
        public String KBId;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static ListInstancePatchesResponseBodyPatches build(java.util.Map<String, ?> map) throws Exception {
            ListInstancePatchesResponseBodyPatches self = new ListInstancePatchesResponseBodyPatches();
            return TeaModel.build(map, self);
        }

        public ListInstancePatchesResponseBodyPatches setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ListInstancePatchesResponseBodyPatches setInstalledTime(String installedTime) {
            this.installedTime = installedTime;
            return this;
        }
        public String getInstalledTime() {
            return this.installedTime;
        }

        public ListInstancePatchesResponseBodyPatches setKBId(String KBId) {
            this.KBId = KBId;
            return this;
        }
        public String getKBId() {
            return this.KBId;
        }

        public ListInstancePatchesResponseBodyPatches setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListInstancePatchesResponseBodyPatches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancePatchesResponseBodyPatches setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
