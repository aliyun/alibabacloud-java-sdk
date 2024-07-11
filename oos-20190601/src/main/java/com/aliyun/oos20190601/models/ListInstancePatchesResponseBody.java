// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about the patch.</p>
     */
    @NameInMap("Patches")
    public java.util.List<ListInstancePatchesResponseBodyPatches> patches;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A615755-9C86-5EA6-BF9E-6E8F1AFF9403</p>
     */
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
        /**
         * <p>The classification of the patch.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Classification")
        public String classification;

        /**
         * <p>The time when the patch was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-28T07:07:20Z</p>
         */
        @NameInMap("InstalledTime")
        public String installedTime;

        /**
         * <p>The Id of KBId.</p>
         * 
         * <strong>example:</strong>
         * <p>apt-utils.amd64</p>
         */
        @NameInMap("KBId")
        public String KBId;

        /**
         * <p>The level of the severity.</p>
         * 
         * <strong>example:</strong>
         * <p>important</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The status of the installation.</p>
         * 
         * <strong>example:</strong>
         * <p>Installed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the patch.</p>
         * 
         * <strong>example:</strong>
         * <p>isc-dhcp-common.amd64:4.3.5-3ubuntu7.3</p>
         */
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
