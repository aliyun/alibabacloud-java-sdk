// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ComparePlaybooksResponseBody extends TeaModel {
    /**
     * <p>The comparison result.</p>
     */
    @NameInMap("CompareResult")
    public ComparePlaybooksResponseBodyCompareResult compareResult;

    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the second version provides more information than the first version. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("New")
        public Boolean _new;

        /**
         * <p>Indicates whether the configurations of the two versions are the same. Valid values: **true** and **false**.</p>
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
