// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ComparePlaybooksResponseBody extends TeaModel {
    /**
     * <p>The result of the comparison.</p>
     */
    @NameInMap("CompareResult")
    public ComparePlaybooksResponseBodyCompareResult compareResult;

    /**
     * <p>The unique ID of the request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2EC05B06-<strong><strong>-5F3E-</strong></strong>-3B1FAD76087A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ComparePlaybooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ComparePlaybooksResponseBody self = new ComparePlaybooksResponseBody();
        return TeaModel.build(map, self);
    }

    public ComparePlaybooksResponseBody setCompareResult(ComparePlaybooksResponseBodyCompareResult compareResult) {
        this.compareResult = compareResult;
        return this;
    }
    public ComparePlaybooksResponseBodyCompareResult getCompareResult() {
        return this.compareResult;
    }

    public ComparePlaybooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ComparePlaybooksResponseBodyCompareResult extends TeaModel {
        /**
         * <p>The description of the comparison result.</p>
         * 
         * <strong>example:</strong>
         * <p>The first version adds one node compared to the second version</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the second version used for comparison is a new version.</p>
         * <ul>
         * <li><p><strong>true</strong>: The version is new.</p>
         * </li>
         * <li><p><strong>false</strong>: The version is not new.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("New")
        public Boolean _new;

        /**
         * <p>Indicates whether the two versions are identical.</p>
         * <ul>
         * <li><p><strong>true</strong>: Identical.</p>
         * </li>
         * <li><p><strong>false</strong>: Not identical.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Same")
        public Boolean same;

        public static ComparePlaybooksResponseBodyCompareResult build(java.util.Map<String, ?> map) throws Exception {
            ComparePlaybooksResponseBodyCompareResult self = new ComparePlaybooksResponseBodyCompareResult();
            return TeaModel.build(map, self);
        }

        public ComparePlaybooksResponseBodyCompareResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ComparePlaybooksResponseBodyCompareResult set_new(Boolean _new) {
            this._new = _new;
            return this;
        }
        public Boolean get_new() {
            return this._new;
        }

        public ComparePlaybooksResponseBodyCompareResult setSame(Boolean same) {
            this.same = same;
            return this;
        }
        public Boolean getSame() {
            return this.same;
        }

    }

}
