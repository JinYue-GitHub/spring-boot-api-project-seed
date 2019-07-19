package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "risk_source")
public class RiskSource {
    /**
     * 风险源ID
     */
    @Id
    @Column(name = "ris_id")
    private Integer risId;

    /**
     * 风险源名(或者别名)
     */
    @Column(name = "ris_name")
    private String risName;

    /**
     * 风险源uuid(唯一标识一条数据)
     */
    @Column(name = "ris_uuid")
    private String risUuid;

    /**
     * 风险源描述
     */
    @Column(name = "ris_desc")
    private String risDesc;

    /**
     * 负责人
     */
    @Column(name = "ris_head")
    private String risHead;

    /**
     * 检查频次
     */
    @Column(name = "ris_check_frequency")
    private String risCheckFrequency;

    /**
     * 是否巡检：0巡检1不巡检
     */
    @Column(name = "ris_inspection_status")
    private Boolean risInspectionStatus;

    /**
     * 施工状态：0未开始1正在施工2已完成
     */
    @Column(name = "ris_construction_status")
    private Boolean risConstructionStatus;

    /**
     * 风险源横坐标
     */
    @Column(name = "ris_position_x")
    private String risPositionX;

    /**
     * 风险源纵坐标
     */
    @Column(name = "ris_position_y")
    private String risPositionY;

    /**
     * 风险源排序
     */
    @Column(name = "ris_order")
    private Integer risOrder;

    /**
     * 风险源是否有效：0生效1失效
     */
    @Column(name = "ris_status")
    private Boolean risStatus;

    /**
     * 创建者
     */
    @Column(name = "ris_create_by")
    private String risCreateBy;

    /**
     * 更新者
     */
    @Column(name = "ris_update_by")
    private String risUpdateBy;

    /**
     * 备注信息
     */
    @Column(name = "ris_remarks")
    private String risRemarks;

    /**
     * 创建时间
     */
    @Column(name = "ris_create_time")
    private Date risCreateTime;

    /**
     * 最后修改时间
     */
    @Column(name = "ris_modified_time")
    private Date risModifiedTime;

    /**
     * 删除标记:0生效,1失效
     */
    @Column(name = "ris_del_flag")
    private Boolean risDelFlag;

    /**
     * 获取风险源ID
     *
     * @return ris_id - 风险源ID
     */
    public Integer getRisId() {
        return risId;
    }

    /**
     * 设置风险源ID
     *
     * @param risId 风险源ID
     */
    public void setRisId(Integer risId) {
        this.risId = risId;
    }

    /**
     * 获取风险源名(或者别名)
     *
     * @return ris_name - 风险源名(或者别名)
     */
    public String getRisName() {
        return risName;
    }

    /**
     * 设置风险源名(或者别名)
     *
     * @param risName 风险源名(或者别名)
     */
    public void setRisName(String risName) {
        this.risName = risName;
    }

    /**
     * 获取风险源uuid(唯一标识一条数据)
     *
     * @return ris_uuid - 风险源uuid(唯一标识一条数据)
     */
    public String getRisUuid() {
        return risUuid;
    }

    /**
     * 设置风险源uuid(唯一标识一条数据)
     *
     * @param risUuid 风险源uuid(唯一标识一条数据)
     */
    public void setRisUuid(String risUuid) {
        this.risUuid = risUuid;
    }

    /**
     * 获取风险源描述
     *
     * @return ris_desc - 风险源描述
     */
    public String getRisDesc() {
        return risDesc;
    }

    /**
     * 设置风险源描述
     *
     * @param risDesc 风险源描述
     */
    public void setRisDesc(String risDesc) {
        this.risDesc = risDesc;
    }

    /**
     * 获取负责人
     *
     * @return ris_head - 负责人
     */
    public String getRisHead() {
        return risHead;
    }

    /**
     * 设置负责人
     *
     * @param risHead 负责人
     */
    public void setRisHead(String risHead) {
        this.risHead = risHead;
    }

    /**
     * 获取检查频次
     *
     * @return ris_check_frequency - 检查频次
     */
    public String getRisCheckFrequency() {
        return risCheckFrequency;
    }

    /**
     * 设置检查频次
     *
     * @param risCheckFrequency 检查频次
     */
    public void setRisCheckFrequency(String risCheckFrequency) {
        this.risCheckFrequency = risCheckFrequency;
    }

    /**
     * 获取是否巡检：0巡检1不巡检
     *
     * @return ris_inspection_status - 是否巡检：0巡检1不巡检
     */
    public Boolean getRisInspectionStatus() {
        return risInspectionStatus;
    }

    /**
     * 设置是否巡检：0巡检1不巡检
     *
     * @param risInspectionStatus 是否巡检：0巡检1不巡检
     */
    public void setRisInspectionStatus(Boolean risInspectionStatus) {
        this.risInspectionStatus = risInspectionStatus;
    }

    /**
     * 获取施工状态：0未开始1正在施工2已完成
     *
     * @return ris_construction_status - 施工状态：0未开始1正在施工2已完成
     */
    public Boolean getRisConstructionStatus() {
        return risConstructionStatus;
    }

    /**
     * 设置施工状态：0未开始1正在施工2已完成
     *
     * @param risConstructionStatus 施工状态：0未开始1正在施工2已完成
     */
    public void setRisConstructionStatus(Boolean risConstructionStatus) {
        this.risConstructionStatus = risConstructionStatus;
    }

    /**
     * 获取风险源横坐标
     *
     * @return ris_position_x - 风险源横坐标
     */
    public String getRisPositionX() {
        return risPositionX;
    }

    /**
     * 设置风险源横坐标
     *
     * @param risPositionX 风险源横坐标
     */
    public void setRisPositionX(String risPositionX) {
        this.risPositionX = risPositionX;
    }

    /**
     * 获取风险源纵坐标
     *
     * @return ris_position_y - 风险源纵坐标
     */
    public String getRisPositionY() {
        return risPositionY;
    }

    /**
     * 设置风险源纵坐标
     *
     * @param risPositionY 风险源纵坐标
     */
    public void setRisPositionY(String risPositionY) {
        this.risPositionY = risPositionY;
    }

    /**
     * 获取风险源排序
     *
     * @return ris_order - 风险源排序
     */
    public Integer getRisOrder() {
        return risOrder;
    }

    /**
     * 设置风险源排序
     *
     * @param risOrder 风险源排序
     */
    public void setRisOrder(Integer risOrder) {
        this.risOrder = risOrder;
    }

    /**
     * 获取风险源是否有效：0生效1失效
     *
     * @return ris_status - 风险源是否有效：0生效1失效
     */
    public Boolean getRisStatus() {
        return risStatus;
    }

    /**
     * 设置风险源是否有效：0生效1失效
     *
     * @param risStatus 风险源是否有效：0生效1失效
     */
    public void setRisStatus(Boolean risStatus) {
        this.risStatus = risStatus;
    }

    /**
     * 获取创建者
     *
     * @return ris_create_by - 创建者
     */
    public String getRisCreateBy() {
        return risCreateBy;
    }

    /**
     * 设置创建者
     *
     * @param risCreateBy 创建者
     */
    public void setRisCreateBy(String risCreateBy) {
        this.risCreateBy = risCreateBy;
    }

    /**
     * 获取更新者
     *
     * @return ris_update_by - 更新者
     */
    public String getRisUpdateBy() {
        return risUpdateBy;
    }

    /**
     * 设置更新者
     *
     * @param risUpdateBy 更新者
     */
    public void setRisUpdateBy(String risUpdateBy) {
        this.risUpdateBy = risUpdateBy;
    }

    /**
     * 获取备注信息
     *
     * @return ris_remarks - 备注信息
     */
    public String getRisRemarks() {
        return risRemarks;
    }

    /**
     * 设置备注信息
     *
     * @param risRemarks 备注信息
     */
    public void setRisRemarks(String risRemarks) {
        this.risRemarks = risRemarks;
    }

    /**
     * 获取创建时间
     *
     * @return ris_create_time - 创建时间
     */
    public Date getRisCreateTime() {
        return risCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param risCreateTime 创建时间
     */
    public void setRisCreateTime(Date risCreateTime) {
        this.risCreateTime = risCreateTime;
    }

    /**
     * 获取最后修改时间
     *
     * @return ris_modified_time - 最后修改时间
     */
    public Date getRisModifiedTime() {
        return risModifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param risModifiedTime 最后修改时间
     */
    public void setRisModifiedTime(Date risModifiedTime) {
        this.risModifiedTime = risModifiedTime;
    }

    /**
     * 获取删除标记:0生效,1失效
     *
     * @return ris_del_flag - 删除标记:0生效,1失效
     */
    public Boolean getRisDelFlag() {
        return risDelFlag;
    }

    /**
     * 设置删除标记:0生效,1失效
     *
     * @param risDelFlag 删除标记:0生效,1失效
     */
    public void setRisDelFlag(Boolean risDelFlag) {
        this.risDelFlag = risDelFlag;
    }
}