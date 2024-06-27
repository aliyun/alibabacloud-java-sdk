// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourceDataDownloadUrlRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public Long dataSourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeDataSourceDataDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceDataDownloadUrlRequest self = new DescribeDataSourceDataDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceDataDownloadUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataSourceDataDownloadUrlRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeDataSourceDataDownloadUrlRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
