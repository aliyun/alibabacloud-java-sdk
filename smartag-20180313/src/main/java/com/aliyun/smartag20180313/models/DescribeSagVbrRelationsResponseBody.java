// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagVbrRelationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>17D79124-104A-42DB-8FCA-CE2957CD1723</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the specified VBR is associated with an SAG instance.</p>
     */
    @NameInMap("SagVbrRelations")
    public java.util.List<DescribeSagVbrRelationsResponseBodySagVbrRelations> sagVbrRelations;

    public static DescribeSagVbrRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagVbrRelationsResponseBody self = new DescribeSagVbrRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagVbrRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagVbrRelationsResponseBody setSagVbrRelations(java.util.List<DescribeSagVbrRelationsResponseBodySagVbrRelations> sagVbrRelations) {
        this.sagVbrRelations = sagVbrRelations;
        return this;
    }
    public java.util.List<DescribeSagVbrRelationsResponseBodySagVbrRelations> getSagVbrRelations() {
        return this.sagVbrRelations;
    }

    public static class DescribeSagVbrRelationsResponseBodySagVbrRelations extends TeaModel {
        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-0nnteglltw6z4b****</p>
         */
        @NameInMap("SagInstanceId")
        public String sagInstanceId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the SAG instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>16884015121212****</p>
         */
        @NameInMap("SagUid")
        public String sagUid;

        /**
         * <p>The ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp15ihkk93ezxppk****</p>
         */
        @NameInMap("VbrInstanceId")
        public String vbrInstanceId;

        public static DescribeSagVbrRelationsResponseBodySagVbrRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagVbrRelationsResponseBodySagVbrRelations self = new DescribeSagVbrRelationsResponseBodySagVbrRelations();
            return TeaModel.build(map, self);
        }

        public DescribeSagVbrRelationsResponseBodySagVbrRelations setSagInstanceId(String sagInstanceId) {
            this.sagInstanceId = sagInstanceId;
            return this;
        }
        public String getSagInstanceId() {
            return this.sagInstanceId;
        }

        public DescribeSagVbrRelationsResponseBodySagVbrRelations setSagUid(String sagUid) {
            this.sagUid = sagUid;
            return this;
        }
        public String getSagUid() {
            return this.sagUid;
        }

        public DescribeSagVbrRelationsResponseBodySagVbrRelations setVbrInstanceId(String vbrInstanceId) {
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

    }

}
