// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetRegistryScanDayNumRequest extends TeaModel {
    @NameInMap("ScanDayNum")
    public Integer scanDayNum;

    public static SetRegistryScanDayNumRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRegistryScanDayNumRequest self = new SetRegistryScanDayNumRequest();
        return TeaModel.build(map, self);
    }

    public SetRegistryScanDayNumRequest setScanDayNum(Integer scanDayNum) {
        this.scanDayNum = scanDayNum;
        return this;
    }
    public Integer getScanDayNum() {
        return this.scanDayNum;
    }

}
