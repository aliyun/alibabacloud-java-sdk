// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagVbrRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("VbrInstanceId")
        public String vbrInstanceId;

        @NameInMap("SagUid")
        public String sagUid;

        @NameInMap("SagInstanceId")
        public String sagInstanceId;

        public static DescribeSagVbrRelationsResponseBodySagVbrRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagVbrRelationsResponseBodySagVbrRelations self = new DescribeSagVbrRelationsResponseBodySagVbrRelations();
            return TeaModel.build(map, self);
        }

        public DescribeSagVbrRelationsResponseBodySagVbrRelations setVbrInstanceId(String vbrInstanceId) {
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        public DescribeSagVbrRelationsResponseBodySagVbrRelations setSagUid(String sagUid) {
            this.sagUid = sagUid;
            return this;
        }
        public String getSagUid() {
            return this.sagUid;
        }

        public DescribeSagVbrRelationsResponseBodySagVbrRelations setSagInstanceId(String sagInstanceId) {
            this.sagInstanceId = sagInstanceId;
            return this;
        }
        public String getSagInstanceId() {
            return this.sagInstanceId;
        }

    }

}
