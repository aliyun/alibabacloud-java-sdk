// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRiskLevelStatisticResponseBody extends TeaModel {
    /**
     * <p>The information about risks at the image level. The risks include vulnerabilities, baselines risks, and malicious file risks.</p>
     */
    @NameInMap("ImageRiskLevelList")
    public java.util.List<DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList> imageRiskLevelList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A60DA4EC-7CD8-577D-AD73-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageRiskLevelStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRiskLevelStatisticResponseBody self = new DescribeImageRiskLevelStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageRiskLevelStatisticResponseBody setImageRiskLevelList(java.util.List<DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList> imageRiskLevelList) {
        this.imageRiskLevelList = imageRiskLevelList;
        return this;
    }
    public java.util.List<DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList> getImageRiskLevelList() {
        return this.imageRiskLevelList;
    }

    public DescribeImageRiskLevelStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList extends TeaModel {
        /**
         * <p>The number of images at the risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Cnt")
        public Integer cnt;

        /**
         * <p>The risk level of the image. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: high risk.</li>
         * <li><strong>2</strong>: medium risk.</li>
         * <li><strong>1</strong>: low risk.</li>
         * <li><strong>0</strong>: no risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ImageRiskLevel")
        public String imageRiskLevel;

        public static DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList self = new DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList setCnt(Integer cnt) {
            this.cnt = cnt;
            return this;
        }
        public Integer getCnt() {
            return this.cnt;
        }

        public DescribeImageRiskLevelStatisticResponseBodyImageRiskLevelList setImageRiskLevel(String imageRiskLevel) {
            this.imageRiskLevel = imageRiskLevel;
            return this;
        }
        public String getImageRiskLevel() {
            return this.imageRiskLevel;
        }

    }

}
