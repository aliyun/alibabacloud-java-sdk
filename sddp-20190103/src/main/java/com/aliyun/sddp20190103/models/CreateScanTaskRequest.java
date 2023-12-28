// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskRequest extends TeaModel {
    /**
     * <p>The unique ID of the data asset, such as an instance, a database, and a bucket. You can call the [DescribeDataLimits](~~DescribeDataLimits~~) operation to query the unique ID.</p>
     */
    @NameInMap("DataLimitId")
    public Long dataLimitId;

    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The interval between two consecutive custom scan tasks. Unit: days. Valid values: 1 to 2147483648.</p>
     */
    @NameInMap("IntervalDay")
    public Integer intervalDay;

    /**
     * <p>The language of the content within the request and response.</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data to be scanned in the Object Storage Service (OSS) bucket. Prefix match, suffix match, and regular expression match are supported.</p>
     */
    @NameInMap("OssScanPath")
    public String ossScanPath;

    /**
     * <p>The type of the service to which the data assets to be scanned belong. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <p>The time when the scan task is executed next time. Unit: hours.</p>
     */
    @NameInMap("RunHour")
    public Integer runHour;

    /**
     * <p>The time when the scan task is executed next time. Unit: minutes.</p>
     */
    @NameInMap("RunMinute")
    public Integer runMinute;

    /**
     * <p>The matching rule that specifies the scan scope of the custom scan task. This parameter takes effect only if you set the **ScanRangeContent** parameter. Valid values:</p>
     * <br>
     * <p>*   **0**: exact match</p>
     * <p>*   **1**: prefix match</p>
     * <p>*   **2**: suffix match</p>
     * <p>*   **3**: regular expression match</p>
     */
    @NameInMap("ScanRange")
    public Integer scanRange;

    /**
     * <p>The data to be scanned in a structured data asset. Prefix match, suffix match, and regular expression match are supported.</p>
     */
    @NameInMap("ScanRangeContent")
    public String scanRangeContent;

    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The name of the scan task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The account that is used to create the scan task.</p>
     */
    @NameInMap("TaskUserName")
    public String taskUserName;

    public static CreateScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScanTaskRequest self = new CreateScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScanTaskRequest setDataLimitId(Long dataLimitId) {
        this.dataLimitId = dataLimitId;
        return this;
    }
    public Long getDataLimitId() {
        return this.dataLimitId;
    }

    public CreateScanTaskRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public CreateScanTaskRequest setIntervalDay(Integer intervalDay) {
        this.intervalDay = intervalDay;
        return this;
    }
    public Integer getIntervalDay() {
        return this.intervalDay;
    }

    public CreateScanTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateScanTaskRequest setOssScanPath(String ossScanPath) {
        this.ossScanPath = ossScanPath;
        return this;
    }
    public String getOssScanPath() {
        return this.ossScanPath;
    }

    public CreateScanTaskRequest setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public CreateScanTaskRequest setRunHour(Integer runHour) {
        this.runHour = runHour;
        return this;
    }
    public Integer getRunHour() {
        return this.runHour;
    }

    public CreateScanTaskRequest setRunMinute(Integer runMinute) {
        this.runMinute = runMinute;
        return this;
    }
    public Integer getRunMinute() {
        return this.runMinute;
    }

    public CreateScanTaskRequest setScanRange(Integer scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public Integer getScanRange() {
        return this.scanRange;
    }

    public CreateScanTaskRequest setScanRangeContent(String scanRangeContent) {
        this.scanRangeContent = scanRangeContent;
        return this;
    }
    public String getScanRangeContent() {
        return this.scanRangeContent;
    }

    public CreateScanTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateScanTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateScanTaskRequest setTaskUserName(String taskUserName) {
        this.taskUserName = taskUserName;
        return this;
    }
    public String getTaskUserName() {
        return this.taskUserName;
    }

}
