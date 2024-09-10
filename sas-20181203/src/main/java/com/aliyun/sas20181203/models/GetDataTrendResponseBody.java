// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetDataTrendResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetDataTrendResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrendResponseBody self = new GetDataTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataTrendResponseBody setData(GetDataTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataTrendResponseBodyData getData() {
        return this.data;
    }

    public GetDataTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataTrendResponseBodyDataItemList extends TeaModel {
        /**
         * <p>The statistical values of the trend data.</p>
         */
        @NameInMap("CountList")
        public java.util.List<Long> countList;

        /**
         * <p>The type of the security data. Valid values:</p>
         * <ul>
         * <li><strong>HC_NEW</strong>: the number of new baseline risks.</li>
         * <li><strong>HC_OPERATE</strong>: the number of handled baseline risks.</li>
         * <li><strong>VUL_NEW</strong>: the number of new vulnerabilities.</li>
         * <li><strong>VUL_OPERATE</strong>: the number of handled vulnerabilities.</li>
         * <li><strong>SUSP_NEW</strong>: the number of new alerts.</li>
         * <li><strong>SUSP_OPERATE</strong>: the number of handled alerts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HC_NEW</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        public static GetDataTrendResponseBodyDataItemList build(java.util.Map<String, ?> map) throws Exception {
            GetDataTrendResponseBodyDataItemList self = new GetDataTrendResponseBodyDataItemList();
            return TeaModel.build(map, self);
        }

        public GetDataTrendResponseBodyDataItemList setCountList(java.util.List<Long> countList) {
            this.countList = countList;
            return this;
        }
        public java.util.List<Long> getCountList() {
            return this.countList;
        }

        public GetDataTrendResponseBodyDataItemList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

    }

    public static class GetDataTrendResponseBodyData extends TeaModel {
        /**
         * <p>The statistical timestamps of the trend data.</p>
         */
        @NameInMap("DateList")
        public java.util.List<Integer> dateList;

        /**
         * <p>The statistical dates and time for the trend data.</p>
         */
        @NameInMap("DateStrList")
        public java.util.List<String> dateStrList;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("ItemList")
        public java.util.List<GetDataTrendResponseBodyDataItemList> itemList;

        public static GetDataTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataTrendResponseBodyData self = new GetDataTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataTrendResponseBodyData setDateList(java.util.List<Integer> dateList) {
            this.dateList = dateList;
            return this;
        }
        public java.util.List<Integer> getDateList() {
            return this.dateList;
        }

        public GetDataTrendResponseBodyData setDateStrList(java.util.List<String> dateStrList) {
            this.dateStrList = dateStrList;
            return this;
        }
        public java.util.List<String> getDateStrList() {
            return this.dateStrList;
        }

        public GetDataTrendResponseBodyData setItemList(java.util.List<GetDataTrendResponseBodyDataItemList> itemList) {
            this.itemList = itemList;
            return this;
        }
        public java.util.List<GetDataTrendResponseBodyDataItemList> getItemList() {
            return this.itemList;
        }

    }

}
