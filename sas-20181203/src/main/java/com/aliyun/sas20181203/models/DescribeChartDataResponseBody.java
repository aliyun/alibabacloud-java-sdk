// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeChartDataResponseBody extends TeaModel {
    /**
     * <p>The valid values for all subtypes of the chart.</p>
     */
    @NameInMap("AllChartSubTypeList")
    public java.util.List<DescribeChartDataResponseBodyAllChartSubTypeList> allChartSubTypeList;

    /**
     * <p>The data type of the chart. Valid values:</p>
     * <ul>
     * <li><strong>commonCoordinate</strong></li>
     * <li><strong>timeCoordinate</strong></li>
     * <li><strong>multipleValue</strong></li>
     * <li><strong>singleValue</strong></li>
     * <li><strong>propertyValue</strong></li>
     * <li><strong>propertyArrayValue</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>propertyArrayValue</p>
     */
    @NameInMap("ChartDataType")
    public String chartDataType;

    /**
     * <p>The subtype values in which the chart is selected.</p>
     */
    @NameInMap("ChartSubTypeList")
    public java.util.List<String> chartSubTypeList;

    /**
     * <p>The type of the chart. Valid values:</p>
     * <ul>
     * <li><strong>timeLine</strong></li>
     * <li><strong>timeBar</strong></li>
     * <li><strong>bar</strong></li>
     * <li><strong>line</strong></li>
     * <li><strong>pie</strong></li>
     * <li><strong>gauge</strong></li>
     * <li><strong>table</strong></li>
     * <li><strong>text</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>timeBar</p>
     */
    @NameInMap("ChartType")
    public String chartType;

    /**
     * <p>The coordinate data.</p>
     */
    @NameInMap("CoordinateData")
    public DescribeChartDataResponseBodyCoordinateData coordinateData;

    /**
     * <p>The values in the multi-value charts.</p>
     */
    @NameInMap("MultipleData")
    public java.util.List<DescribeChartDataResponseBodyMultipleData> multipleData;

    /**
     * <p>The attribute value of the array chart.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("PropertyArrayValue")
    public String propertyArrayValue;

    /**
     * <p>The data of the chart.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;totalCount\&quot;: \&quot;0\&quot;}</p>
     */
    @NameInMap("PropertyValue")
    public String propertyValue;

    /**
     * <p>The array data of the chart.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ProperyArrayValue")
    public String properyArrayValue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50CCE62A-2BC4-5CF8-B976-E4F62A31****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data of the single value chart.</p>
     */
    @NameInMap("SingleData")
    public DescribeChartDataResponseBodySingleData singleData;

    public static DescribeChartDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChartDataResponseBody self = new DescribeChartDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChartDataResponseBody setAllChartSubTypeList(java.util.List<DescribeChartDataResponseBodyAllChartSubTypeList> allChartSubTypeList) {
        this.allChartSubTypeList = allChartSubTypeList;
        return this;
    }
    public java.util.List<DescribeChartDataResponseBodyAllChartSubTypeList> getAllChartSubTypeList() {
        return this.allChartSubTypeList;
    }

    public DescribeChartDataResponseBody setChartDataType(String chartDataType) {
        this.chartDataType = chartDataType;
        return this;
    }
    public String getChartDataType() {
        return this.chartDataType;
    }

    public DescribeChartDataResponseBody setChartSubTypeList(java.util.List<String> chartSubTypeList) {
        this.chartSubTypeList = chartSubTypeList;
        return this;
    }
    public java.util.List<String> getChartSubTypeList() {
        return this.chartSubTypeList;
    }

    public DescribeChartDataResponseBody setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public DescribeChartDataResponseBody setCoordinateData(DescribeChartDataResponseBodyCoordinateData coordinateData) {
        this.coordinateData = coordinateData;
        return this;
    }
    public DescribeChartDataResponseBodyCoordinateData getCoordinateData() {
        return this.coordinateData;
    }

    public DescribeChartDataResponseBody setMultipleData(java.util.List<DescribeChartDataResponseBodyMultipleData> multipleData) {
        this.multipleData = multipleData;
        return this;
    }
    public java.util.List<DescribeChartDataResponseBodyMultipleData> getMultipleData() {
        return this.multipleData;
    }

    public DescribeChartDataResponseBody setPropertyArrayValue(String propertyArrayValue) {
        this.propertyArrayValue = propertyArrayValue;
        return this;
    }
    public String getPropertyArrayValue() {
        return this.propertyArrayValue;
    }

    public DescribeChartDataResponseBody setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }
    public String getPropertyValue() {
        return this.propertyValue;
    }

    public DescribeChartDataResponseBody setProperyArrayValue(String properyArrayValue) {
        this.properyArrayValue = properyArrayValue;
        return this;
    }
    public String getProperyArrayValue() {
        return this.properyArrayValue;
    }

    public DescribeChartDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChartDataResponseBody setSingleData(DescribeChartDataResponseBodySingleData singleData) {
        this.singleData = singleData;
        return this;
    }
    public DescribeChartDataResponseBodySingleData getSingleData() {
        return this.singleData;
    }

    public static class DescribeChartDataResponseBodyAllChartSubTypeList extends TeaModel {
        /**
         * <p>The subtype of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>CID_SUSPICIOUS_TREND-ALL</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The name of the chart subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>All Alerts</p>
         */
        @NameInMap("SubTypeName")
        public String subTypeName;

        public static DescribeChartDataResponseBodyAllChartSubTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChartDataResponseBodyAllChartSubTypeList self = new DescribeChartDataResponseBodyAllChartSubTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeChartDataResponseBodyAllChartSubTypeList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribeChartDataResponseBodyAllChartSubTypeList setSubTypeName(String subTypeName) {
            this.subTypeName = subTypeName;
            return this;
        }
        public String getSubTypeName() {
            return this.subTypeName;
        }

    }

    public static class DescribeChartDataResponseBodyCoordinateDataYAxisList extends TeaModel {
        /**
         * <p>The name of the data type.</p>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subtype data of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>CID_SUSPICIOUS_TREND-AL</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The type of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The values of the y-axis that corresponds to x-axis points.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeChartDataResponseBodyCoordinateDataYAxisList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChartDataResponseBodyCoordinateDataYAxisList self = new DescribeChartDataResponseBodyCoordinateDataYAxisList();
            return TeaModel.build(map, self);
        }

        public DescribeChartDataResponseBodyCoordinateDataYAxisList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChartDataResponseBodyCoordinateDataYAxisList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribeChartDataResponseBodyCoordinateDataYAxisList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeChartDataResponseBodyCoordinateDataYAxisList setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeChartDataResponseBodyCoordinateData extends TeaModel {
        /**
         * <p>The x-axis values.</p>
         */
        @NameInMap("XAxis")
        public java.util.List<String> XAxis;

        /**
         * <p>The y-axis values.</p>
         */
        @NameInMap("YAxisList")
        public java.util.List<DescribeChartDataResponseBodyCoordinateDataYAxisList> YAxisList;

        public static DescribeChartDataResponseBodyCoordinateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChartDataResponseBodyCoordinateData self = new DescribeChartDataResponseBodyCoordinateData();
            return TeaModel.build(map, self);
        }

        public DescribeChartDataResponseBodyCoordinateData setXAxis(java.util.List<String> XAxis) {
            this.XAxis = XAxis;
            return this;
        }
        public java.util.List<String> getXAxis() {
            return this.XAxis;
        }

        public DescribeChartDataResponseBodyCoordinateData setYAxisList(java.util.List<DescribeChartDataResponseBodyCoordinateDataYAxisList> YAxisList) {
            this.YAxisList = YAxisList;
            return this;
        }
        public java.util.List<DescribeChartDataResponseBodyCoordinateDataYAxisList> getYAxisList() {
            return this.YAxisList;
        }

    }

    public static class DescribeChartDataResponseBodyMultipleData extends TeaModel {
        /**
         * <p>The font color, which is an RGBA value.</p>
         * 
         * <strong>example:</strong>
         * <p>#FFA800</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The name of the data type.</p>
         * 
         * <strong>example:</strong>
         * <p>Safety</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>safe</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public Long value;

        public static DescribeChartDataResponseBodyMultipleData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChartDataResponseBodyMultipleData self = new DescribeChartDataResponseBodyMultipleData();
            return TeaModel.build(map, self);
        }

        public DescribeChartDataResponseBodyMultipleData setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeChartDataResponseBodyMultipleData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChartDataResponseBodyMultipleData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeChartDataResponseBodyMultipleData setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DescribeChartDataResponseBodySingleData extends TeaModel {
        /**
         * <p>The name of the data type.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value in the single value chart.</p>
         * 
         * <strong>example:</strong>
         * <p>172</p>
         */
        @NameInMap("Value")
        public Long value;

        public static DescribeChartDataResponseBodySingleData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChartDataResponseBodySingleData self = new DescribeChartDataResponseBodySingleData();
            return TeaModel.build(map, self);
        }

        public DescribeChartDataResponseBodySingleData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChartDataResponseBodySingleData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeChartDataResponseBodySingleData setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
