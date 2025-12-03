// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenTitlesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-XXXXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SasScreenSettingList")
    public java.util.List<DescribeScreenTitlesResponseBodySasScreenSettingList> sasScreenSettingList;

    public static DescribeScreenTitlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenTitlesResponseBody self = new DescribeScreenTitlesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenTitlesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenTitlesResponseBody setSasScreenSettingList(java.util.List<DescribeScreenTitlesResponseBodySasScreenSettingList> sasScreenSettingList) {
        this.sasScreenSettingList = sasScreenSettingList;
        return this;
    }
    public java.util.List<DescribeScreenTitlesResponseBodySasScreenSettingList> getSasScreenSettingList() {
        return this.sasScreenSettingList;
    }

    public static class DescribeScreenTitlesResponseBodySasScreenSettingList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3267</p>
         */
        @NameInMap("ScreenID")
        public Long screenID;

        /**
         * <strong>example:</strong>
         * <p>titlexxx</p>
         */
        @NameInMap("ScreenTitle")
        public String screenTitle;

        public static DescribeScreenTitlesResponseBodySasScreenSettingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenTitlesResponseBodySasScreenSettingList self = new DescribeScreenTitlesResponseBodySasScreenSettingList();
            return TeaModel.build(map, self);
        }

        public DescribeScreenTitlesResponseBodySasScreenSettingList setScreenID(Long screenID) {
            this.screenID = screenID;
            return this;
        }
        public Long getScreenID() {
            return this.screenID;
        }

        public DescribeScreenTitlesResponseBodySasScreenSettingList setScreenTitle(String screenTitle) {
            this.screenTitle = screenTitle;
            return this;
        }
        public String getScreenTitle() {
            return this.screenTitle;
        }

    }

}
