// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserInstancePatchesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Patches")
    public java.util.List<ListUserInstancePatchesResponseBodyPatches> patches;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserInstancePatchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserInstancePatchesResponseBody self = new ListUserInstancePatchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserInstancePatchesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserInstancePatchesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserInstancePatchesResponseBody setPatches(java.util.List<ListUserInstancePatchesResponseBodyPatches> patches) {
        this.patches = patches;
        return this;
    }
    public java.util.List<ListUserInstancePatchesResponseBodyPatches> getPatches() {
        return this.patches;
    }

    public ListUserInstancePatchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserInstancePatchesResponseBodyPatches extends TeaModel {
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

        public static ListUserInstancePatchesResponseBodyPatches build(java.util.Map<String, ?> map) throws Exception {
            ListUserInstancePatchesResponseBodyPatches self = new ListUserInstancePatchesResponseBodyPatches();
            return TeaModel.build(map, self);
        }

        public ListUserInstancePatchesResponseBodyPatches setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ListUserInstancePatchesResponseBodyPatches setInstalledTime(String installedTime) {
            this.installedTime = installedTime;
            return this;
        }
        public String getInstalledTime() {
            return this.installedTime;
        }

        public ListUserInstancePatchesResponseBodyPatches setKBId(String KBId) {
            this.KBId = KBId;
            return this;
        }
        public String getKBId() {
            return this.KBId;
        }

        public ListUserInstancePatchesResponseBodyPatches setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListUserInstancePatchesResponseBodyPatches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserInstancePatchesResponseBodyPatches setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
