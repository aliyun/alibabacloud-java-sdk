// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetRegistryScanDayNumResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration of the scan period.</p>
     */
    @NameInMap("ScanDayNumConfig")
    public GetRegistryScanDayNumResponseBodyScanDayNumConfig scanDayNumConfig;

    public static GetRegistryScanDayNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegistryScanDayNumResponseBody self = new GetRegistryScanDayNumResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegistryScanDayNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegistryScanDayNumResponseBody setScanDayNumConfig(GetRegistryScanDayNumResponseBodyScanDayNumConfig scanDayNumConfig) {
        this.scanDayNumConfig = scanDayNumConfig;
        return this;
    }
    public GetRegistryScanDayNumResponseBodyScanDayNumConfig getScanDayNumConfig() {
        return this.scanDayNumConfig;
    }

    public static class GetRegistryScanDayNumResponseBodyScanDayNumConfig extends TeaModel {
        /**
         * <p>The selectable day options.</p>
         * 
         * <strong>example:</strong>
         * <p>1,3,7,15,30,90,180,365</p>
         */
        @NameInMap("DayNumList")
        public String dayNumList;

        /**
         * <p>The scan period. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ScanDayNum")
        public Integer scanDayNum;

        public static GetRegistryScanDayNumResponseBodyScanDayNumConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRegistryScanDayNumResponseBodyScanDayNumConfig self = new GetRegistryScanDayNumResponseBodyScanDayNumConfig();
            return TeaModel.build(map, self);
        }

        public GetRegistryScanDayNumResponseBodyScanDayNumConfig setDayNumList(String dayNumList) {
            this.dayNumList = dayNumList;
            return this;
        }
        public String getDayNumList() {
            return this.dayNumList;
        }

        public GetRegistryScanDayNumResponseBodyScanDayNumConfig setScanDayNum(Integer scanDayNum) {
            this.scanDayNum = scanDayNum;
            return this;
        }
        public Integer getScanDayNum() {
            return this.scanDayNum;
        }

    }

}
