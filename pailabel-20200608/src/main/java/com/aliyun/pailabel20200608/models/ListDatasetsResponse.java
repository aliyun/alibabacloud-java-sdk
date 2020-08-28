// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailabel20200608.models;

import com.aliyun.tea.*;

public class ListDatasetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrMsg")
    @Validation(required = true)
    public String errMsg;

    @NameInMap("ErrCode")
    @Validation(required = true)
    public Integer errCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDatasetsResponseData data;

    public static ListDatasetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponse self = new ListDatasetsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListDatasetsResponseData extends TeaModel {
        @NameInMap("PageIndex")
        @Validation(required = true)
        public Integer pageIndex;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalNum")
        @Validation(required = true)
        public Integer totalNum;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Data")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> data;

        public static ListDatasetsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseData self = new ListDatasetsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
