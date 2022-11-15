// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class ResultSetOptions extends TeaModel {
    @NameInMap("DecimalReturnType")
    public String decimalReturnType;

    @NameInMap("LongReturnType")
    public String longReturnType;

    public static ResultSetOptions build(java.util.Map<String, ?> map) throws Exception {
        ResultSetOptions self = new ResultSetOptions();
        return TeaModel.build(map, self);
    }

    public ResultSetOptions setDecimalReturnType(String decimalReturnType) {
        this.decimalReturnType = decimalReturnType;
        return this;
    }
    public String getDecimalReturnType() {
        return this.decimalReturnType;
    }

    public ResultSetOptions setLongReturnType(String longReturnType) {
        this.longReturnType = longReturnType;
        return this;
    }
    public String getLongReturnType() {
        return this.longReturnType;
    }

}
