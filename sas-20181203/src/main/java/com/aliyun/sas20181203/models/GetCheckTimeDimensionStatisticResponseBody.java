// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckTimeDimensionStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>028CF634-5268-5660-9575-48C9ED6B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeDimensionStatisticDTO")
    public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO timeDimensionStatisticDTO;

    public static GetCheckTimeDimensionStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckTimeDimensionStatisticResponseBody self = new GetCheckTimeDimensionStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckTimeDimensionStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckTimeDimensionStatisticResponseBody setTimeDimensionStatisticDTO(GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO timeDimensionStatisticDTO) {
        this.timeDimensionStatisticDTO = timeDimensionStatisticDTO;
        return this;
    }
    public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO getTimeDimensionStatisticDTO() {
        return this.timeDimensionStatisticDTO;
    }

    public static class GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>COMPLIANCE_Pass</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>194</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas build(java.util.Map<String, ?> map) throws Exception {
            GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas self = new GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas();
            return TeaModel.build(map, self);
        }

        public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1712592000000</p>
         */
        @NameInMap("DataTime")
        public Long dataTime;

        @NameInMap("StatisticDatas")
        public java.util.List<GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas> statisticDatas;

        public static GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems build(java.util.Map<String, ?> map) throws Exception {
            GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems self = new GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems();
            return TeaModel.build(map, self);
        }

        public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems setDataTime(Long dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public Long getDataTime() {
            return this.dataTime;
        }

        public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems setStatisticDatas(java.util.List<GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas> statisticDatas) {
            this.statisticDatas = statisticDatas;
            return this;
        }
        public java.util.List<GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItemsStatisticDatas> getStatisticDatas() {
            return this.statisticDatas;
        }

    }

    public static class GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO extends TeaModel {
        @NameInMap("Dates")
        public java.util.List<Long> dates;

        /**
         * <strong>example:</strong>
         * <p>CheckPassRate</p>
         */
        @NameInMap("StatisticType")
        public String statisticType;

        @NameInMap("TimeDimensionStatisticItems")
        public java.util.List<GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems> timeDimensionStatisticItems;

        public static GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO self = new GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO();
            return TeaModel.build(map, self);
        }

        public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO setDates(java.util.List<Long> dates) {
            this.dates = dates;
            return this;
        }
        public java.util.List<Long> getDates() {
            return this.dates;
        }

        public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO setStatisticType(String statisticType) {
            this.statisticType = statisticType;
            return this;
        }
        public String getStatisticType() {
            return this.statisticType;
        }

        public GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTO setTimeDimensionStatisticItems(java.util.List<GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems> timeDimensionStatisticItems) {
            this.timeDimensionStatisticItems = timeDimensionStatisticItems;
            return this;
        }
        public java.util.List<GetCheckTimeDimensionStatisticResponseBodyTimeDimensionStatisticDTOTimeDimensionStatisticItems> getTimeDimensionStatisticItems() {
            return this.timeDimensionStatisticItems;
        }

    }

}
