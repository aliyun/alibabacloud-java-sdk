// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test51_0_0.models;

import com.aliyun.tea.*;

public class TbTestApiRequest extends TeaModel {
    @NameInMap("query")
    public TbTestApiRequestQuery query;

    public static TbTestApiRequest build(java.util.Map<String, ?> map) throws Exception {
        TbTestApiRequest self = new TbTestApiRequest();
        return TeaModel.build(map, self);
    }

    public TbTestApiRequest setQuery(TbTestApiRequestQuery query) {
        this.query = query;
        return this;
    }
    public TbTestApiRequestQuery getQuery() {
        return this.query;
    }

    public static class TbTestApiRequestQuery extends TeaModel {
        @NameInMap("teat")
        public String teat;

        public static TbTestApiRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            TbTestApiRequestQuery self = new TbTestApiRequestQuery();
            return TeaModel.build(map, self);
        }

        public TbTestApiRequestQuery setTeat(String teat) {
            this.teat = teat;
            return this;
        }
        public String getTeat() {
            return this.teat;
        }

    }

}
